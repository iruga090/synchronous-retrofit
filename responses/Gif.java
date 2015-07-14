package responses;

public class Gif{
	private String type;
	private String id;
	private String url;
	private String bitly_gif_url;
	private String source;
	private String username;
	private GiphyImage images;
  
	public  void setType(String type){
		this.type = type;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public void setBitly_gif_url(String bitly_gif_url){
		this.bitly_gif_url = bitly_gif_url;
	} 

	public void setSource(String source){
		this.source = source;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public void setImages(GiphyImage images){
		this.images = images;
	}

	public String getType(){
		return type;
	}

	public String getId(){
		return id;
	}

	public String getUrl(){
		return url;
	}

	public String getBitly_gif_url(){
		return bitly_gif_url;
	}

	public String getSource(){
		return source;
	}

	public String getUsername(){
		return username;
	}

	public GiphyImage getImages(){
		return images;
	}
}