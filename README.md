# Задание 2.4. Работа с исключениями
***
1. Напишите статический метод, который принимает на вход три параметра: login, password и confirmPassword.
2. Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания. *Например, java_skypro.go*
3. У параметра login есть ограничение по длине – он должен быть равен или меньше 20 символов. Если login длиннее 20 символов, то необходимо выбросить исключение – `WrongLoginException`.
4. Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания. *Например, D_1hWiKjjP_9*
5. У параметра password тоже есть ограничение по длине – он должен быть строго меньше 20 символов.
6. Параметры password и confirmPassword должны быть равны. Если это требование не соблюдается, то нужно выбросить`WrongPasswordException`.
7. Обработка исключений проводится внутри метода.
8. Для обработки исключений используйте multi-catch block.
9. Метод должен возвращать`true`, если значения параметров подходят под ограничения, или`false` – если условия не выполняются.