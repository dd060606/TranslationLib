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



