package homework10.task1;

public interface IDictionary<TKey, TValue> {
    int size();

    void addWord(TKey key, TValue value);

    TValue getValueById(int i);

    boolean dictionaryContainsKey(TKey key);

    class Word<TKey, TValue> {
        TKey key;
        TValue value;

        public Word(TKey key, TValue value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Word{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
