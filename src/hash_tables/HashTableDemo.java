package hash_tables;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>();
//        hashTable.put("IP", "192.168.0.1");
//        hashTable.put("PORT", "8080");
//        hashTable.put("API_KEY", "rfs-12313123-ABC");
//        hashTable.put("API_URL", "https://api.example.com");
//        hashTable.put("USERNAME", "admin");
        hashTable.put("PASSWORD", "password123");
//        hashTable.put("DATE", "2023-10-01");
//        hashTable.put("TIME", "12:00:00");
//        hashTable.put("COUNTRY", "USA");
        hashTable.put("CITY", "New York");
        hashTable.put("ZIP_CODE", "10001");
//        hashTable.put("PHONE", "123-456-7890");
    }
}
