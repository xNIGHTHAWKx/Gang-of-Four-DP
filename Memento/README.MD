# **WZORZEC PROJEKTOWY - MEMENTO**

Wzorzec projektowy **Memento** stosujemy, gdy potrzebujemy możliwość przywracania poprzedniego (lub dawnego) stanu obiektu.
W jego przypadku stosujemy takie metody jak _undo_ i _rollback_. 
Magiczne ciasteczko hermetyzuje zapamiętanie stanu z określonego punktu - **check-point**.

**Konsekwencje wykorzystania Memento:**
* upraszcza klasę Originatora deleguje zapisywanie i odtwarzanie do klasy Memento,
* przechowywanie stanów wymaga dodatkowej pamięci - za jej wykorzystanie odpowiedzialny jest klient **CareTaker**.
