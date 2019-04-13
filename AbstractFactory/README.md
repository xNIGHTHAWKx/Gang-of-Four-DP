# **WZORZEC PROJEKTOWY - Abstract Factory**
Przy użyciu jednej fabryki i jej providera, możemy stworzyć wiele różnych typów obiektów. Tak jak w przypadku innych **wzorców kreacyjnych**,
unikamy używania konstrukcji "new".
Konsekwencje korzystania z tego wzorca:
* wymuszenie przechodzenia przez interfejs, aby utworzyć konkretny obiekt,
* napisanie nowego zestawu klas do wzajemnego oddziaływania z obiektem jest pracochłonne.
