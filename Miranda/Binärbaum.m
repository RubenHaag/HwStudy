||Binärbäume

numbaum * ::= Leer | Bin (numbaum *) * (numbaum *)

einfuegen :: numbaum num -> num -> numbaum num
einfuegen Leer a = Bin (Leer) a (Leer)
einfuegen (Bin lt m rt) a = Bin (einfuegen lt a) m rt, if a < m
einfuegen (Bin lt m rt) a = Bin lt m (einfuegen rt a), if a > m
einfuegen (Bin lt m rt) a = error "ajdihdw", if a = m

inorderPrint :: numbaum num -> [num]
inorderPrint Leer = []
inorderPrint (Bin lt m rt) = [a | a <- inorderPrint lt] ++[m] ++ [b | b <- inorderPrint rt]

lturn :: numbaum num -> numbaum num
lturn Leer = Leer
lturn (Bin lt m (Bin rlt rm rrt)) = Bin (Bin lt m rlt) rm rrt

rturn :: numbaum num -> numbaum num
rturn Leer = Leer
rturn (Bin (Bin llt lm lrt) m rt) = Bin llt lm (Bin lrt m rt)

groesze :: numbaum num -> num
groesze Leer = 0
groesze (Bin Leer m Leer) = 1
groesze (Bin lt m rt) = 1 + groesze lt + groesze rt

height :: numbaum num -> num
height Leer = 0
height (Bin Leer m Leer) = 1
height (Bin lt m rt) = 1 + max2 (height lt) (height rt)

bFak :: numbaum num -> num
bFak Leer = 0
bFak (Bin lt m rt) = height rt - height lt

toAvl :: numbaum num -> numbaum num
toAvl Leer = Leer
toAvl (Bin lt m rt) = toAvl (rturn (Bin lt m rt)), if bFak (Bin lt m rt) < -1 & bFak lt <= 0
toAvl (Bin lt m rt) = toAvl (lturn (Bin lt m rt)), if bFak (Bin lt m rt) > 1 & bFak rt >= 0
toAvl (Bin lt m rt) = toAvl (rturn (Bin (lturn lt) m rt)), if bFak (Bin lt m rt) < -1 & bFak lt > 0
toAvl (Bin lt m rt) = toAvl (lturn (Bin lt m (rturn rt))), if bFak (Bin lt m rt) > 1 & bFak rt < 0
toAvl (Bin lt m rt) = (Bin (toAvl lt) m (toAvl rt)), if bFak (Bin lt m rt) <= 1 & bFak (Bin lt m rt) >= -1
