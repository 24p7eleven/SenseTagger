package cbnu.nlp.test;

import cbnu.nlp.dict.SejongScanner;
import cbnu.nlp.model.Sentence;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 * Created by leechanghee on 11/24/14.
 */
public class main {
    public static void main(String[] args) {
//        SejongScanner ss = new SejongScanner();
//        File[] files  = ss.getFileList();
//        Sentence sentence = new Sentence();
//        String text = "";
//        for(File f : files){
//            String path;
//            BufferedReader br = null;
//            path = f.getPath();
//            br = ss.readFiles(path);
//            try {
//                text = ss.loadCorpus(br);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(text);
        String line;
        String text = "<date>\n" +
                "BSAA0001-00000001\t1993/06/08\t1993/SN + //SP + 06/SN + //SP + 08/SN\n" +
                "</date>\n" +
                "<page>\n" +
                "BSAA0001-00000002\t19\t19/SN\n" +
                "</page>\n" +
                "</source>\n" +
                "<head>\n" +
                "BSAA0001-00000003\t엠마누엘\t엠마누엘/NNP\n" +
                "BSAA0001-00000004\t웅가로\t웅가로/NNP\n" +
                "BSAA0001-00000005\t/\t//SP\n" +
                "BSAA0001-00000006\t의상서\t의상__01/NNG + 서/JKB\n" +
                "BSAA0001-00000007\t실내\t실내/NNG\n" +
                "BSAA0001-00000008\t장식품으로…\t장식품/NNG + 으로/JKB + …/SE\n" +
                "BSAA0001-00000009\t디자인\t디자인/NNG\n" +
                "BSAA0001-00000010\t세계\t세계__02/NNG\n" +
                "BSAA0001-00000011\t넓혀\t넓히/VV + 어/EC\n" +
                "</head>\n" +
                "<p>\n" +
                "BSAA0001-00000012\t프랑스의\t프랑스/NNP + 의/JKG\n" +
                "BSAA0001-00000013\t세계적인\t세계__02/NNG + 적/XSN + 이/VCP + ᆫ/ETM\n" +
                "BSAA0001-00000014\t의상\t의상__01/NNG\n" +
                "BSAA0001-00000015\t디자이너\t디자이너/NNG\n" +
                "BSAA0001-00000016\t엠마누엘\t엠마누엘/NNP\n" +
                "BSAA0001-00000017\t웅가로가\t웅가로/NNP + 가/JKS\n" +
                "BSAA0001-00000018\t실내\t실내/NNG\n" +
                "BSAA0001-00000019\t장식용\t장식__05/NNG + 용/XSN\n" +
                "BSAA0001-00000020\t직물\t직물/NNG\n" +
                "BSAA0001-00000021\t디자이너로\t디자이너/NNG + 로/JKB\n" +
                "BSAA0001-00000022\t나섰다.\t나서/VV + 었/EP + 다/EF + ./SF\n" +
                "</p>";

        while(line = text.)
    }
}
