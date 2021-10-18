import java.util.*;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;

public class Prog5 {
    public static TreeMap<String, Integer> fillTreeMap(Scanner scan, HashMap<String, Integer> hash) {
        long startTime = System.nanoTime();
        TreeMap<String, Integer> treeQMap = new TreeMap<>();
        while(scan.hasNextLine()) {
            int wordValue = 0;
            String line = scan.nextLine();
            String items[] = line.split("");
            for(int i = 0; i < items.length; i++) {
                if (hash.get(items[i]) != null) {
                    int value = hash.get(items[i]);
                    wordValue = wordValue + value;
                }
            }
            treeQMap.put(line, wordValue);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for the TreeMap loading is: " + (estimatedTime) + " nanoseconds");
        return treeQMap;
    }

    public static TreeMap<String, Integer> fillAliceTreeMap(Scanner scan, HashMap<String, Integer> hash) {
        long time1, time2;
        TreeMap<String, Integer> treeAliceMap = new TreeMap<>();
        time1 = System.currentTimeMillis();
        while(scan.hasNextLine()) {
            int wordValue = 0;
            String line = scan.nextLine();
            String[] items = line.split(" ");
            for(int i = 0; i < items.length; i++) {
                wordValue = 0;
                char[] c = new char[items[i].length()];
                for(int j = 0; j < items[i].length(); j++) {
                    if(Character.isLetter(items[i].charAt(j))) {
                        c[j] = Character.toLowerCase(items[i].charAt(j));
                    }
                }
                String s = String.valueOf(c);
                for(int k = 0; k < s.length(); k++) {
                    if (hash.get(Character.toString(c[k])) != null) {
                        int value = hash.get(Character.toString(c[k]));
                        wordValue = wordValue + value;
                    }
                }
                treeAliceMap.put(s, wordValue);
            }
        }
        time2 = System.currentTimeMillis();
        System.out.println("Time for the Alice In Wonderland TreeMap insertion is: " + (time2 - time1) + " milliseconds");
        return treeAliceMap;
    }
    
    public static HashMap<String, Integer> fillHashMap(Scanner scan, HashMap<String, Integer> hash) {
        long startTime = System.nanoTime();
        HashMap<String, Integer> hashQMap = new HashMap<>();
        while(scan.hasNextLine()) {
            int wordValue = 0;
            String line = scan.nextLine();
            String items[] = line.split("");
            for(int i  = 0; i < items.length; i++) {
                if (hash.get(items[i]) != null) {
                    int value = hash.get(items[i]);
                    wordValue = wordValue + value;
                }
            }
            hashQMap.put(line, wordValue);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for the HashMap loading is: " + (estimatedTime) + " nanoseconds");
        return hashQMap;
    }

    public static HashMap<String, Integer> fillAliceHashMap(Scanner scan, HashMap<String, Integer> hash) {
        long time1, time2;
        HashMap<String, Integer> hashAliceMap = new HashMap<>();
        time1 = System.currentTimeMillis();
        while(scan.hasNextLine()) {
            int wordValue = 0;
            String line = scan.nextLine();
            String[] items = line.split(" ");
            for(int i = 0; i < items.length; i++) {
                wordValue = 0;
                char[] c = new char[items[i].length()];
                for(int j = 0; j < items[i].length(); j++) {
                    if(Character.isLetter(items[i].charAt(j))) {
                        c[j] = Character.toLowerCase(items[i].charAt(j));
                    }
                }
                String s = String.valueOf(c);
                for(int k = 0; k < s.length(); k++) {
                    if (hash.get(Character.toString(c[k])) != null) {
                        int value = hash.get(Character.toString(c[k]));
                        wordValue = wordValue + value;
                    }
                }
                hashAliceMap.put(s, wordValue);
            }
        }
        time2 = System.currentTimeMillis();
        System.out.println("Time for the Alice In Wonderland HashMap insertion is: " + (time2 - time1) + " milliseconds");
        return hashAliceMap;
    }

    public static void iterateHashMap(HashMap<String, Integer> hash) {
        long startTime = System.nanoTime();
        Iterator hmIterator = hash.entrySet().iterator();
        while(hmIterator.hasNext()) {
            System.out.println(hmIterator.next() + " ");
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for the HashMap printing is: " + (estimatedTime) + " nano seconds");
    }

    public static void iterateTreeMap(TreeMap<String, Integer> tree) {
        long startTime = System.nanoTime();
        Iterator tmIterator = tree.entrySet().iterator();
        while(tmIterator.hasNext()) {
            System.out.println(tmIterator.next() + " ");
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for the TreeMap printing is: " + (estimatedTime) + " nano seconds");
    }

    public static void iterateAliceHashMap(HashMap<String, Integer> hash) {
        int itemCounter = 0;
        int valueCounter = 0;
        long startTime = System.nanoTime();
        Iterator<Map.Entry<String, Integer>> itr = hash.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            itemCounter++;
            valueCounter = valueCounter + entry.getValue();
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Total number of items in HashMap is: " + itemCounter);
        System.out.println("Total value of items in HashMap is: " + valueCounter);
        System.out.println("Time for the HashMap iterating is: " + (estimatedTime) + " nano seconds");
    }

    public static void iterateAliceTreeMap(TreeMap<String, Integer> tree) {
        int itemCounter = 0;
        int valueCounter = 0;
        long startTime = System.nanoTime();
        Iterator<Map.Entry<String, Integer>> itr = tree.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            itemCounter++;
            valueCounter = valueCounter + entry.getValue();
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Total number of items in TreeMap is: " + itemCounter);
        System.out.println("Total value of items in TreeMap is: " + valueCounter);
        System.out.println("Time for the TreeMap iterating is: " + (estimatedTime) + " nano seconds");
    }

    public static HashSet<String> fillHashSet(Scanner scan) {
        HashSet<String> hashAliceSet = new HashSet<>();
        long time1, time2;
        time1 = System.currentTimeMillis();
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] items = line.split(" ");
            for(int i = 0; i < items.length; i++) {
                char[] c = new char[items[i].length()];
                for(int j = 0; j < items[i].length(); j++) {
                    if(Character.isLetter(items[i].charAt(j))) {
                        c[j] = Character.toLowerCase(items[i].charAt(j));
                    }
                }
                String s = String.valueOf(c);
                hashAliceSet.add(s);
            }
        }
        time2 = System.currentTimeMillis();
        System.out.println("Time for the HashSet insertion is: " + (time2 - time1) + " milliseconds");
        return hashAliceSet;
    }

    public static TreeSet<String> fillTreeSet(Scanner scan) {
        TreeSet<String> hashAliceSet = new TreeSet<>();
        long time1, time2;
        time1 = System.currentTimeMillis();
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] items = line.split(" ");
            for(int i = 0; i < items.length; i++) {
                char[] c = new char[items[i].length()];
                for(int j = 0; j < items[i].length(); j++) {
                    if(Character.isLetter(items[i].charAt(j))) {
                        c[j] = Character.toLowerCase(items[i].charAt(j));
                    }
                }
                String s = String.valueOf(c);
                hashAliceSet.add(s);
            }
        }
        time2 = System.currentTimeMillis();
        System.out.println("Time for the TreeSet insertion is: " + (time2 - time1) + " milliseconds");
        return hashAliceSet;
    }

    public static void main(String[] args) {
        try {
            File qFile = new File("q.txt");
            File scrabbleFile = new File("Scrabble.txt");
            File alice = new File("AliceInWonderland.txt");
            Scanner scanAlice = new Scanner(alice);
            Scanner scanAlice2 = new Scanner(alice);
            Scanner scanAlice3 = new Scanner(alice);
            Scanner scanAlice4 = new Scanner(alice);
            Scanner scanScrabble = new Scanner(scrabbleFile);
            Scanner scanqFile = new Scanner(qFile);
            Scanner scanqFile2 = new Scanner(qFile);
            HashMap<String, Integer> hashScrabble = new HashMap<>();
            HashMap<String, Integer> hashQmap = new HashMap<>();
            TreeMap<String, Integer> treeQmap = new TreeMap<>();
            HashSet<String> hashSet = new HashSet<>();
            TreeSet<String> treeSet = new TreeSet<>();
            HashMap<String, Integer> aliceHashMap = new HashMap<>();
            TreeMap<String, Integer> aliceTreeMap = new TreeMap<>();
            while(scanScrabble.hasNextLine()) {
                String line = scanScrabble.nextLine();
                String[] items = line.split(" ");
                hashScrabble.put(items[0], Integer.parseInt(items[1]));
            }
            System.out.println("Part One: ");
            hashQmap = fillHashMap(scanqFile, hashScrabble);
            iterateHashMap(hashQmap);
            treeQmap = fillTreeMap(scanqFile2, hashScrabble);
            iterateTreeMap(treeQmap);
            System.out.println("Part Two: ");
            hashSet = fillHashSet(scanAlice);
            treeSet = fillTreeSet(scanAlice2);
            System.out.println("Part Three: ");
            aliceHashMap = fillAliceHashMap(scanAlice3, hashScrabble);
            iterateAliceHashMap(aliceHashMap);
            aliceTreeMap = fillAliceTreeMap(scanAlice4, hashScrabble);
            iterateAliceTreeMap(aliceTreeMap);
            scanScrabble.close();
            scanqFile.close();
            scanqFile2.close();
            scanAlice.close();
            scanAlice2.close();
            scanAlice3.close();
            scanAlice4.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error has occurred!");
            e.printStackTrace();
        }
    }
}
