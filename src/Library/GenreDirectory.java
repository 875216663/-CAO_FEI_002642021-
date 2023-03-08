/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class GenreDirectory {
     ArrayList<Genre> genrelist;
      
    
    public GenreDirectory() {
        this.genrelist = new ArrayList<Genre>();
    }

    public ArrayList<Genre> getGenrelist() {
        return genrelist;
    }

    public void setGenrelist(ArrayList<Genre> genrelist) {
        this.genrelist = genrelist;
    }
    
    
    public Genre createGenre(String name) {
        Genre g = new Genre();
          g.setGenrename(name);
        
        this.genrelist.add(g);
        return g;
    }
    
}
