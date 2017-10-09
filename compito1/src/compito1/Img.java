package compito1;

import java.util.ArrayList;

public class Img {
	private ArrayList<Comp> compList;
	
	
	public Img(){
		compList=new ArrayList<Comp>();
	}
	
	void addComp(Comp c){
		compList.add(c);
	}
	
	void print(){
		for(int i=0;i<compList.size();i++){
			compList.get(i).print();
		}
	}
}
