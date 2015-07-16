import retrofit.Callback;
import responses.*;
import retrofit.RetrofitError;
import retrofit.client.Response;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.Random;



public class Main{
	public static void main(String[] args) {
	System.out.println("Que tipo de gif quieres ver?:");
	Scanner scan = new Scanner(System.in);
	String find;
		String search = scan.nextLine();
	Scanner num = new Scanner(System.in);
	System.out.println("Cuantos GIF desea ver?:");
	int count;
	count = num.nextInt();

			Main.searchGifs(search, count);
	}

	public static void searchGifs(String term, int numImages){
		GiphyService service = new GiphyService();

		GiphyResponse gifs = service.searchGifs(term);
		int i = 0;
		for (Gif gif : gifs.getData()) {	
		}
		while(i<=numImages){
		i++;
			Random rnd = new Random();
			Gif ran = gifs.getData().get( (int) (rnd.nextDouble()*gifs.getData().size()+0));
			Main.openInBrowser(ran.getImages().fixed_height.url);
		}
			
	}

	public static void openInBrowser(String url){
		if(Desktop.isDesktopSupported()){
			try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (URISyntaxException e) {
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }
			
		}
	}
}
