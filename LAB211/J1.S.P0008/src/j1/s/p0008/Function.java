package j1.s.p0008;
import java.util.*;
/**
 *
 * @author VPC
 */
public class Function {
public HashMap charCount (String content){
HashMap<Character, Integer> charCounter = new HashMap<Character, Integer>();
for (char ch: content.toCharArray()) {
if (Character.isLetter(ch) || Character.isDigit(ch)){
if (!charCounter.containsKey(ch)) {
charCounter.put(ch, 1);
} else {
charCounter.put(ch, charCounter.get(ch) + 1);
}
}
}
return charCounter;
}

public HashMap wordCount (String content) {
HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
StringTokenizer tokenizer = new StringTokenizer (content, "[!@#$%^&*,.?;:'(){} ]"); 
while (tokenizer.hasMoreTokens ()) {
String token = tokenizer.nextToken();
if (!wordCounter.containsKey(token)) {
wordCounter.put(token, 1);
} else {
wordCounter.put(token, wordCounter.get (token) + 1);
}
}
return wordCounter;
}

}