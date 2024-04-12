import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int keyCnt = 0;
        int keyTemp=0;
        String tempName;
        String tempNum;
        String tempAdd;
        String tempClass;
        String query;
        boolean go = true;

        HashMap<Integer,String> nameMap = new HashMap<Integer,String>();
        HashMap<Integer,String> numberMap = new HashMap<Integer,String>();
        HashMap<Integer,String> addressMap = new HashMap<Integer,String>();
        HashMap<Integer,String> classMap = new HashMap<Integer,String>();

        while(go){
            System.out.println("**************************************************");
            System.out.println("                  전화번호부");
            System.out.println("**************************************************");
            System.out.println("1.조회     2.수정     3.추가     4.삭제     5.종료");
            System.out.print("메뉴를 입력 하세요 : ");
            int menu = scan.nextInt();
            switch(menu){
                case 1: for(Integer key : nameMap.keySet()){
                            System.out.println(nameMap.get(key)+"\t"+numberMap.get(key)+"\t"+addressMap.get(key)+"\t"+classMap.get(key));
                        }
                        continue;
                case 2: String dummy = scan.nextLine();
                        System.out.print("수정할 연락처 이름을 입력하세요 : ");
                        tempName = scan.nextLine();
                        for(Integer key : nameMap.keySet()){
                            if(nameMap.get(key).equals(tempName)){
                                keyTemp=key;
                            }
                        }
                        System.out.print("이름을 입력하세요 : ");
                        tempName = scan.nextLine();
                        System.out.print("번호를 입력하세요 : ");
                        tempNum = scan.nextLine();
                        System.out.print("주소를 입력하세요 : ");
                        tempAdd = scan.nextLine();
                        System.out.print("관계를 입력하세요 : ");
                        tempClass = scan.nextLine();
                        nameMap.put(keyTemp, tempName);
                        numberMap.put(keyTemp,tempNum);
                        addressMap.put(keyTemp, tempAdd);
                        classMap.put(keyTemp, tempClass);
                        continue;
                case 3: dummy = scan.nextLine();
                        System.out.print("이름을 입력하세요 : ");
                        tempName = scan.nextLine();
                        System.out.print("번호를 입력하세요 : ");
                        tempNum = scan.nextLine();
                        System.out.print("주소를 입력하세요 : ");
                        tempAdd = scan.nextLine();
                        System.out.print("관계를 입력하세요 : ");
                        tempClass = scan.nextLine();

                        nameMap.put(keyCnt, tempName);
                        numberMap.put(keyCnt,tempNum);
                        addressMap.put(keyCnt, tempAdd);
                        classMap.put(keyCnt, tempClass);
                        keyCnt++;
                        continue;
                case 4: dummy = scan.nextLine();    
                        System.out.print("삭제할 연락처 이름을 입력하세요 : ");
                        tempName = scan.nextLine();
                        for(Integer key : nameMap.keySet()){
                            if(nameMap.get(key).equals(tempName)){
                                keyTemp=key;
                            }
                        }
                        nameMap.remove(keyTemp);
                        numberMap.remove(keyTemp);
                        addressMap.remove(keyTemp);
                        classMap.remove(keyTemp);
                        continue;
                case 5: go=false;

            }
        }
        
    }
}