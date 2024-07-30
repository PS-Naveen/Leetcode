public class Codec {

    private List<String> array = new ArrayList<>();
    private int ptr = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        array.add(longUrl);
        return String.valueOf(ptr++);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return array.get(Integer.parseInt(shortUrl));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));