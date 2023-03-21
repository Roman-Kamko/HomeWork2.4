package edu.skypro.homework;

import edu.skypro.homework.exceptions.WrongLoginException;
import edu.skypro.homework.exceptions.WrongPasswordException;

public class Authentication {
    public static boolean check(String login,
                                String password,
                                String confirmPassword) {
        try {
            if (
                    checkParam(login) == true &&
                    checkParam(password) == true &&
                    checkConfirmPass(password, confirmPassword) == true
            ) {
                return true;
            }
        } catch (WrongLoginException e) {
            System.out.println("для login и/или password использовано более 20 символов");
        } catch (WrongPasswordException e) {
            System.out.println("password и confirmPassword не совпадают");
        }
        return false;
    }

    private static boolean checkParam(String param) {
        if (param.length() > 20) {
            throw new WrongLoginException();
        }
        if (param.matches("[_A-Za-z0-9]+") == false) {
            //варианта по лучше я не смог найти)
            return false;
        }
        return true;
    }

    private static boolean checkConfirmPass(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        return true;
    }
}
