package compito1;

public class PlusImgGenerator extends ImgGenerator {

	@Override
	House makeHouse() {
		House nHouse=new PlusHouse();
		return nHouse;
	}

	@Override
	Person makePerson() {
		Person nPerson=new PlusPerson();
		return nPerson;
	}
}
