# TranslationLib
A simple Java translation library

Create a new object Translator
```
Translator translator = new Translator(new File("C:/myLanguageFolder"));
```
You can create files in the language folder :  


french.lang


english.lang

or use 
```
translator.createLangFile("spanish");
``` 
You can get a lang file with 
```
translator.getLangFileWithName("spanish");
```
For select a language use
```
translator.selectLanguage("french");
```
Or select the default language
```
translator.selectDefaultLanguage();
```
In your languages files, write:
```
myId1=myTranslation
```
You can translate with an id and the selected language
```
translator.translate("myId1");
```
translator.translate("myId"); return the text after = in the language file 

# Example
In my java class :
``` 
 Translator translator = new Translator(new File("D:/languages"));

  //The default language it's english but you can change with translator.setDefaultLangue("french");
  translator.selectDefaultLanguage();
  System.out.println("In English hello is said: " + translator.translate("myId"));
  
  translator.selectLanguage("french");
  System.out.println("In French hello is said: " + translator.translate("myId"));
```
In my file french.lang :
``` 
myId=Bonjour
```
And in my file english.lang : 
```
myId=Hello
``` 
The result is : 


In English hello is said: Hello


In French hello is said: Bonjour

