package lib;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import lib.Error;

public class Edit {
    Error error = new Error();
    private Scanner scan;
    private HashMap<Integer, String> nameMap;
    private HashMap<Integer, String> numberMap;
    private HashMap<Integer, String> addressMap;
    private HashMap<Integer, String> classMap;
    private Integer keyTemp;
    private String tempName;
    private String tempNum;
    private String tempClass;

    public void thisIs(HashMap<Integer, String> nameMap, HashMap<Integer, String> numberMap,
            HashMap<Integer, String> addressMap, HashMap<Integer, String> classMap, Integer keyTemp, String tempName) {
        this.nameMap = nameMap;
        this.numberMap = numberMap;
        this.addressMap = addressMap;
        this.classMap = classMap;
        this.keyTemp = keyTemp;
        this.tempName = tempName;
    }

    public Integer forEqual(String tempName, Integer keyTemp, HashMap<Integer, String> nameMap) {
        thisIs(nameMap, null, null, null, keyTemp, tempName);

        for (Integer key : nameMap.keySet()) {
            if (nameMap.get(key).equals(tempName)) {
                keyTemp = key;
            }
        }
        return keyTemp;
    }

    public void inputData(Scanner scan, HashMap<Integer, String> nameMap, HashMap<Integer, String> numberMap,
            HashMap<Integer, String> addressMap, HashMap<Integer, String> classMap, Integer keyTemp) {
        thisIs(nameMap, numberMap, addressMap, classMap, keyTemp, null);
        System.out.print("이름을 입력하세요 : ");
        String tempName = scan.nextLine();
        tempNum = error.NumberException(tempNum, scan);
        System.out.print("주소를 입력하세요 : ");
        String tempAdd = scan.nextLine();
        tempClass = error.RelationException(tempClass, scan);
        nameMap.put(keyTemp, tempName);
        numberMap.put(keyTemp, tempNum);
        addressMap.put(keyTemp, tempAdd);
        classMap.put(keyTemp, tempClass);
    }

    public void Remove(HashMap<Integer, String> nameMap, HashMap<Integer, String> numberMap,
            HashMap<Integer, String> addressMap, HashMap<Integer, String> classMap, Integer keyTemp) {
        thisIs(nameMap, numberMap, addressMap, classMap, keyTemp, null);

        nameMap.remove(keyTemp);
        numberMap.remove(keyTemp);
        addressMap.remove(keyTemp);
        classMap.remove(keyTemp);
    }
}