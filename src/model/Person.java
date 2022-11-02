package model;

import exceptions.IdInvalidException;
import exceptions.StringVoidException;

/**
 * @author Marlon E. Zambrano Z.
 */
public class Person {

    private long identification;
    private String names;
    private String lastNames;
    private Gender gender;

    public Person(long identification, String names, String lastNames, Gender gender) 
            throws Exception {
        if(!((1000000L >= identification && identification <= 9999999L)
                || (1000000000L >= identification && identification <= 9999999999L))) {
            throw new IdInvalidException("The number identification has not "
                    + "7 or 10 characters");
        }
        if ("".equals(names.trim())) {
            throw new StringVoidException("Names cannot be empty");
        }
        if ("".equals(lastNames.trim())) {
            throw new StringVoidException("Lastnames cannot be empty");
        }

        this.identification = identification;
        this.names = names;
        this.lastNames = lastNames;
        this.gender = gender;
    }

    public long getIdentification() {
        return identification;
    }

    public void setIdentification(long identification) {
        this.identification = identification;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.identification != other.identification) {
            return false;
        }
        return true;
    }
}
