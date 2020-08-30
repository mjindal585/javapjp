package com.wipro.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*4 Create a Spring web application where index page has a link requesting to display top view series / moviesOn click
the controller has to return a Model Object of ArrayList containing list of names of the series or movies (Minimum 10)
which needs to be displayed in out result.jsp using JSTL (HINT : forEach tag)
*/

public class SpringMVC4 {
	@RequestMapping("/resultlist4")
	public ModelAndView DisplayResult4(){
		ArrayList<String> sl=new ArrayList<String>();
		sl.add("The Shawshank Redemption");
		sl.add(" The Godfather ");
		sl.add(" The Godfather: Part II ");
		sl.add("The Dark Knight");
		sl.add(" 12 Angry Men");
		sl.add(" Schindler's List");
		sl.add(" The Lord of the Rings: The Return of the King");
		sl.add(" Pulp Fiction");
		sl.add(" The Good, the Bad and the Ugly");
		sl.add("The Lord of the Rings: The Fellowship of the Ring");
		sl.add(" Fight Club");
		sl.add("Forrest Gump ");
		sl.add("Inception");
		
		ModelAndView mv=new ModelAndView("result4","showlist",sl);
		return mv;
	}
}
