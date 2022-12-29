Úkol
Napište program, který bude vystavovat REST rozhraní pro ticketovací systém na pobočce. Ten by měl vystavovat následující REST služby:
-	Vygenerování pořadového čísla s tím že bude vracet navíc ještě datum a čas vygenerování ve frontě
-	Získání aktuálního aktivního čekajícího čísla
-	Smazání posledního aktivního čísla
-    Například:
-    V seznamu aktuálních ticketů bude:
-	1245, 2017-0901 15:22, 0
-	1246, 2017-0901 15:35, 1
-	1247, 2017-0901 15:50, 2
-   Vygenerování nového vrátí:
-	1248, 2017-0901 15:55, 3
-  Po smazání posledního bude v seznamu
-	1246, 2017-0901 15:35, 0
-	1247, 2017-0901 15:50, 1
-	1248, 2017-0901 15:55, 2

Úloha by měla být na 1-2 hodin