import java.util.*;

public class Cypher {

    private final char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private Set<Character> remainingLetters;
    private Map<Integer, List<CypherWord>> lengthWordMap;
    private Map<Character, List<CypherWord>> letterWordMap;
    private Map<Character, Character> cypherMap;

    public Cypher(String cypherText){

        //remainingLetters
        remainingLetters = new HashSet<>();
        for(Character c : ALPHABET){

            remainingLetters.add(c);
        }

        //lengthWordMap
        String[] words = cypherText.split(" ");
        for (String word : words){

            if(!lengthWordMap.containsKey(word.length())){

                lengthWordMap.put(word.length(), new ArrayList<>());
            }

            CypherWord cWord = new CypherWord(word);
            lengthWordMap.get(word.length()).add(cWord);

            //letterWordMap
            for(String c : word.split("")){

                if (!letterWordMap.containsKey(c.charAt(0)))
                    letterWordMap.put(c.charAt(0), new ArrayList<>());

                letterWordMap.get(c.charAt(0)).add(cWord);
            }
        }
        //cypherMap
        cypherMap = new HashMap<>();
        for(Character c : ALPHABET){

            cypherMap.put(c, null);
        }
    }
}
