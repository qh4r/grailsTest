package grails.lab

class Teacher {

    String firstName
    String lastName
    String phoneNumber
    Date born
    String title
    Boolean isActive

    static hasMany = [students: Student]

    static constraints = {
        firstName maxSize: 255
        lastName maxSize: 255
        title maxSize: 20
    }
}
