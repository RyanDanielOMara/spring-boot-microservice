package com.ryandanielomara.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;

import com.ryandanielomara.models.CatalogItem;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogeResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        return Collections.singletonList(
            new CatalogItem("Transformers", "Test", 4)
        );
        
    }
    
}