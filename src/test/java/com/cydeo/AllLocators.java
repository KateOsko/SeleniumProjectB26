package com.cydeo;

public class AllLocators {


        /*
        LOCATORS

        To locate we must use a set of methods coming from Selenium library
        -findElement() + locator method

        Action we want to apply:
        - .click();    -->> It clicks to the given web element
        - .sendKeys(); -->> "string to be sent" sends text to the webElement
        - Keys.ENTER -->>

        1. .findElement(By.id)
        <div name="hu58" id="asdf57"> </div>
           driver.findElement(By.id("asdf57"));

        2. findElement(By.name)
        <div name="hu58"> </div>
        driver.findElement(By.name("hu58"));

        3.findElement(By.className)
        <div name="hu58" id="asdf57" class="cde45"> </div>
        driver.findElement(By.className("cde45"));

        4. findElement(By.tagName)
        <div name="hu58" id="asdf57" class="cde45"> </div>
        driver.findElement(By.tagName("div"));

        5.findElement(By.linkText)
        <a href="https://something.com"> GOOGLE SEARCH </a>
        driver.findElement(By.linkText("GOOGLE SEARCH"));

        6.findElement(By.partialLinkText)
        <a href="https://something.com"> GOOGLE SEARCH </a>
        syntax1: driver.findElement(By.partialLinkText("GOOGLE"));
        syntax2: driver.findElement(By.partialLinkText("SEARCH"));
        syntax3: driver.findElement(By.partialLinkText("GOOGLE SEARCH"));

        7. cssSelector
        -------------------------2 types of syntaxes----------------------------
               #1
               tagName[attribute = 'value']
               ex: <a href="https://www.tesla.com" id="uh7" name="bb95"> TESLA </a>

                    • id  --->>   a[id='uh7']
                    • name --->> a[name='bb95']
                    • href --->> a[href = 'https://www.tesla.com']


               #2
               • tagName#idValue
               • tagName.classValue
               ex: <a href="https://www.tesla.com" id="uh7" name="bb95" class="kk99"> TESLA </a>

               - id    -->> a#uh7     ( you can use #idValue to be less specific)
               - class -->> a.kk99    ( you can use .classValue to be less specific)

            To  go from parent to child we use “>” sign.
                • syntax: tagName[attribute='value'] > childTagName
                • Using cssSelector we cannot go from child to parent.


          8. XPath
          • Absolute -->> starts with "/" starts from the root element/ parent and goes down one by one (not very useful)
          • Relative -->> starts with "//" can start from anywhere

          Main syntax: //tagName[@attribute = 'value']

          Ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>
          name: //a[@name='uh68']
          class: //a[@class='ff58']
          id: //a[@id='bb22']

          • We are NOT limited with id, name, class, or href attributes.
          • We can use any custom attribute and their value with XPATH locator.

           • Parent -->> child using "/"
           • child -->> Parent using "/..."
           • We use  ”/following-sibling::tagname”  this goes to the next sibling.
           • We use  “/preceding-sibling::tagname”  this goes to previous sibling.

         */

    public static int[] front11(int[] a, int[] b) {
            int [] arr = new int []{};

            if(a.length==0) {
                arr[0]=b[0];
                return arr;
            } else if (b.length==0) {
                arr[0]=a[0];
                return arr;
            }

            if((a.length>=1) && (b.length>=1)){
                arr[0]=a[0];
                arr[1]=b[0];
                return arr;

            }
            return arr;
        }


//    public static void main(String[] args) {
//        int[] a = {2, 3, 5};
//        int[] b = {1, 3, 5};
//        System.out.println(Arrays.toString(fix23(a, b)));
//    }

}
    /*
    int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        int newLength = arr1.length + arr2.length;

        String[] newArr = new String[newLength];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

      return newArr;
    }

     */
