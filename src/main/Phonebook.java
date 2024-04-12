package main;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import lib.Edit;
import lib.Menu;

public class Phonebook {
    public static void main(String[] args) throws Exception {
        Edit edit = new Edit();
        Menu menu = new Menu();

        Scanner scan = new Scanner(System.in);

        int keyCnt = 0;
        int keyTemp = 0;
        int menuNum = 0;
        String dummy = "";
        String tempName = "";
        String tempNum;
        String tempAdd;
        String tempClass;
        String query;
        boolean go = true;

        HashMap<Integer, String> nameMap = new HashMap<Integer, String>();
        HashMap<Integer, String> numberMap = new HashMap<Integer, String>();
        HashMap<Integer, String> addressMap = new HashMap<Integer, String>();
        HashMap<Integer, String> classMap = new HashMap<Integer, String>();

        while (go) {
            try {
                menu.Main();
                menuNum = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\n1 ~ 5번 숫자를 입력해주세요!");
                scan.nextLine();
            }

            switch (menuNum) {
                case 1:
                    for (Integer key : nameMap.keySet()) {
                        System.out.println(nameMap.get(key) + "\t" + numberMap.get(key) + "\t" + addressMap.get(key)
                                + "\t" + classMap.get(key));
                    }
                    continue;
                case 2:
                    tempName = menu.Edit(dummy, scan, tempName);
                    keyTemp = edit.forEqual(tempName, keyTemp, nameMap);
                    edit.inputData(scan, nameMap, numberMap, addressMap, classMap, keyTemp);
                    continue;
                case 3:
                    dummy = scan.nextLine();
                    edit.inputData(scan, nameMap, numberMap, addressMap, classMap, keyCnt);
                    keyCnt++;
                    continue;
                case 4:
                    tempName = menu.Delete(dummy, scan, tempName);
                    keyTemp = edit.forEqual(tempName, keyTemp, nameMap);
                    edit.Remove(nameMap, numberMap, addressMap, classMap, keyTemp);
                    continue;
                case 5:
                    go = false;
            }
        }
    }
}