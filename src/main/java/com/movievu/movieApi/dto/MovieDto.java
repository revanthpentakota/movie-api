package com.movievu.movieApi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

// This is the Data Transfer Object for Movie API

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Integer movieId;

    @NotBlank(message = "Please provide movie's title!!!")
    private String title;

    @NotBlank(message = "Please provide movie's director!!!")
    private String director;

    @NotBlank(message = "Please provide movie's studio!!!")
    private String studio;

    private Set<String> movieCast;

    
    private Integer releaseYear;

    @NotBlank(message = "Please provide movie's poster!!!")
    private String poster;

    @NotBlank(message = "Please provide movie's posterUrl!!!")
    private String posterUrl;
}
