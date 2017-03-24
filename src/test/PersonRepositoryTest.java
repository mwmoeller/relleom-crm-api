package com.relleom.crm;
 
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.Assert.assertEquals;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringMongoConfiguration.class})

public class PersonRepositoryTest {
 
	@Autowired
	PersonRepository personRepository;
 
	static final int QTY = 20;
 
	@Before
	public void init() {
		personRepository.deleteAll();
		for (int i = 0; i < QTY; i++) {
			Person person = new Person();
            person.setFirstName("Bob");
            person.setLastName("Smith." + i);
            person.setEmail("bsmith." + i + "@foo.bar");
            person.setTitle("owner");
			personRepository.save(person);
		}
	}
 
	@Test
	public void CountOfSavedPeopleShouldEqual20() {
		List<Person> list = personRepository.findAll();
		assertEquals(QTY, list.size());
	}

    @Test
    public void FindPersonByLastNameShouldReturnOnePerson() {
        //semi-randomly choose a number between 0 and 19
        List<Integer> personIndex = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
        Collections.shuffle(personIndex);
        //get one of the 20 people from the database
		List<Person> list = personRepository.findByLastName("Smith." + personIndex.get(0));
		assertEquals(1, list.size());
	}

    @Test
    public void FindPersonByLastNameLikeShouldReturnElevenPeople() {
        //get all people with lastname that start with Smtih.1
		List<Person> list = personRepository.findByLastNameLike("Smith.1");
		assertEquals(11, list.size());
	}

    public void FindPersonByEmailAddressShouldReturnOnePerson() {
        //semi-randomly choose a number between 0 and 19
        List<Integer> personIndex = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
        Collections.shuffle(personIndex);
        int i = personIndex.get(0);
        //get one of the 20 people from the database
		List<Person> list = personRepository.findByEmail("bsmith." + i + "@foo.bar");
		assertEquals(1, list.size());
	}


}