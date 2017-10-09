package compito1;

public class ImgGenerator {
	Img createImg(){
		Img img=makeImg();
		
		img.addComp(makeHouse());
		img.addComp(makePerson());
		
		return img;
	}
	
	
	
	Img makeImg(){
		Img nImg=new Img();
		return nImg;
	}
	
	House makeHouse(){
		House nHouse=new House();
		return nHouse;
	}
	
	Person makePerson(){
		Person nPerson=new Person();
		return nPerson;
	}
}
