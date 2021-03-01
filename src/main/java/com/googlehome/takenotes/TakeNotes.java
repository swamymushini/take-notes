package com.googlehome.takenotes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TakeNotes {
private static List<String> notes = new ArrayList<String>();


@RequestMapping("getNotes")
public List<String> getNotes(){
	notes.add("Take me home");
	return notes;
}

@RequestMapping("addNotes/{note}")
public String addNotes(@PathVariable(name="note") String note){
	notes.add(note);
	return "Added [" + note+"] Successfully";
}


}
