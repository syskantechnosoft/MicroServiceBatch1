package io.javabrains.movieinfoservice.models;

public class Movie {
    private String movieId;
    private String name;
    private String description;
    private String tag;
    private String imdbId;

    public Movie(String movieId, String name, String description, String tag, String imdbId) {
        this.movieId = movieId;
        this.name = name;
        this.description = description;
        this.tag = tag;
        this.imdbId = imdbId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	
	
    
}
