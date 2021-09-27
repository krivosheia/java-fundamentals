package homework10.task1;

import java.util.ArrayList;

public class MyDictionary<TKey, TValue> implements IDictionary<TKey, TValue> {
    private ArrayList<IDictionary.Word> wordArrayList = new ArrayList<>();

    @Override
    public int size() {
        return wordArrayList.size();
    }

    @Override
    public void addWord(TKey key, TValue value) {
        if (!dictionaryContainsKey(key)) {
            wordArrayList.add(new IDictionary.Word(key, value));
        }
    }

    @Override
    public TValue getValueById(int i) {
        return (TValue) wordArrayList.get(i).value;
    }

    @Override
    public boolean dictionaryContainsKey(TKey key) {
        for (IDictionary.Word word: wordArrayList) {
            if (word.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        int i = 0;
        String str = "MyDictionary{";
        for (IDictionary.Word word: wordArrayList) {
            str += "\n" + i++ + ": " + word.toString();
        }
        str += "\n}";
        return str;
    }
}
