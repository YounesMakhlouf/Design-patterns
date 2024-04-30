public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Imagine", "John Lennon");
        Song song2 = new Song("Bohemian Rhapsody", "Queen");

        Playlist rockPlaylist = new Playlist("Rock Classics");
        Playlist favorites = new Playlist("My Favorites");

        rockPlaylist.add(song1);
        rockPlaylist.add(song2);
        favorites.add(rockPlaylist); // Add a playlist to another playlist
        favorites.add(song2);

        // Play the playlists
        System.out.println("Playing playlist: " + favorites.getName());
        favorites.play();

        // Change playback speed of all songs in "My Favorites"
        favorites.setPlaybackSpeed(1.5f);
        System.out.println("Playing playlist at 1.5x speed: " + favorites.getName());
        favorites.play();
    }
}