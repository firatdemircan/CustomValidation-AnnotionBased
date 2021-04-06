# CustomValidation-AnnotionBased
Custom Validation with annotain based for email. 

Custom Validation.

--create a package with name configuration

--Create interface that has annotaion on top like 
  @Retention(RetentionPolicy.RUNTIME)//when do you want your validation start
  @Target(ElementType.FIELD) // where it will be affected
  @Constraint(validatedBy=EmailValid.class) //Whihc class will has the methods
  
 --Create a class and implements it from ConstraintValidator
 
  -- just specify your rules in isValid method

