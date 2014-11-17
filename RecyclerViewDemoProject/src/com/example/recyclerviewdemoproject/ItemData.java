package com.example.recyclerviewdemoproject;

public class ItemData {


	private String title;
	private int imageUrl;
	private String section;
	
	public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public ItemData(String title,int imageUrl,String section){
		
		this.title = title;
		this.imageUrl = imageUrl;
		this.section=section;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(int imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}