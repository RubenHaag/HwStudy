stack * ::= Leer | Node * (stack *)

empty :: stack *
empty = Leer

||Legt auf den Stapel ein Element
push :: stack * -> * -> stack *
push a b = Node b a

||entfernt das oberste Element
pop :: stack * -> stack *
pop (Node a b) = b
pop Leer = error "Stack muss min. ein Element enthalten"

||gibt das oberste Element zurück
top :: stack * -> *
top (Node a b) = a
top Leer = error "stack ist leer"

x = push (push (push empty 6) 7) 9
y = 5