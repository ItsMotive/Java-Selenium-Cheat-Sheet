# Project Name

Java Selenium Cheat Sheet

## Table of Contents

- [About](#about)
- [Common Methods](#methods)
    - [WebDriver Interface](#webdriver-interface)
    - [WebElement Interface](#webelement-interface)
    - [By Class](#by-class)
    - [Action Class](#action-class)
    - [Expected Conditions Class](#expected-conditions)
    - [WebDriverWait Class](#webdriverwait-class)
    - [Select Class](#select-class)
    - [JavaScriptExecutor Interface](#javascriptexecutor-interface)
    - [Cookie Interface](#cookie-interface)
- [Topics](#topics)
    - [CSS Selectors](#css-selectors)

## About

A repository to recall commonly used Selenium functions. Also to practice using Git commits and merges. 

## Methods

### WebDriver Interface
- Description : Controls browsers and interacts with elements

    - ```get(string URL)``` : Loads a new webpage
    - ```findElement(By by)``` : Finds the first WebElement using the given method to locate it
    - ```findElements(By by)``` : Finds all WebElements using the given method to locate it
    - ```navigate()``` : Returns an instance of the Navigation interface that can be used to control browser navigation
    - ```manage()``` : Returns an instance of the Options interface for managing driver-specific settings

### WebElement Interface
- Description : Represents HTML elements on a web page

    - ```click()``` : Clicks on the element
    - ```sendKeys(Keys to Send)``` : Sends keystrokes to the element
    - ```getText()``` : Returns the visible text of the element
    - ```getAttribute(String name)``` : Returns the value of the specified attribute of the element
    - ```isDisplayed()``` : Checks if element is displayed
    - ```isEnabled()``` : Checks if element is enabled
    - ```isSelected()``` : Checks if element is selected

### By Class
- Description : Mechanisms to locate elements

    - ```By.id(String id)``` : Locates by ID attribute
    - ```By.name(String name)``` : Locates by Name attribute
    - ```By.className(String className)``` : Locates by Class Name attribute
    - ```By.tagName(String tagName)``` : Locates by Tag Name attribute
    - ```By.xpath(String xPathExpression)``` : Locates by XPath location
    - ```By.cssSelector(String cssSelector)``` : Locates by CSS selector

### Action Class
- Description : Mechanisms to interact with web application

    - ```moveToElement(WebElement toElement)``` : Moves the mouse to the middle of the element
    - ```click(WebElement element)``` : Performs a click action
    - ```doubleClick(WebElement element)``` : Performs a double click action
    - ```contextClick(WebElement element)``` : Performs a right click action
    - ```sendKeys(Keys to Send)``` : Sends keystrokes to the element
    - ```dragAndDrop(WebElement source, WebElement target)``` : Performs a drag and drop action

### Expected Conditions Class
- Description : Mechanism to set predefined conditions to wait

    - ```visibilityOfElementLocator(By locator)``` : Waits until the element is located
    - ```elementToBeClickable(By locator)``` : Waits until the element can be clicked
    - ```titleContains(String title)``` : Waits until the page title contains the argument
    - ```alertIsPresent()``` : Waits until an alert is present

### WebDriverWait Class
- Description : Mechanism to configure waits

    - ```WebDriverWait(WebDriver driver, long timeOutInSeconds)``` : Waits for a set amount of time (s)
    - ```until(expectedCondition<t> condition)``` : Waits until condition is true or timeout expires
    - ```withTimeout(Duration timeout)``` : Configures timeout durations
    - ```pollingEvert(Duration pollingEvery)``` : Configures polling interval

### Explicit Wait
- Description: Wait mechanic that waits for a certain condition
    - presenceOfElementLocated : Waits for element to be present (does not include visible)
      ```WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("element_id")));```

### Select Class
- Description : Mechanism to interact with dropdown elements

    - ```selectByVisibleText(String Text)``` : Selects an option by using visible text attribute
    - ```selectByValue(String value)``` : Selects an option by using value attribute
    - ```selectByIndex(int index)``` : Selects an option by using index attribute
    - ```deselectAll()``` : Deselects all options
    - ```deselectByVisibleText(String text)``` : Deselects option by visible text attribute

### JavaScriptExecutor Interface
- Description : Mechanism to execute JavaScript code

    - ```executeScript(String script, Object... args)``` : Executes JavaScript in the currently selected frame/window
    - ```executeAsyncScript(String script, Object... args)``` : Executes an asynchronous JavaScript function

### Cookie Interface
- Description : Represents browser cookie

    - ```getName()``` : Gets cookie name
    - ```getValue()``` : Gets cookie value
    - ```getDomain()``` : Gets cookie domain
    - ```getPath()``` : Gets path to Cookie
    - ```isSecure()``` : Checks to see if cookie is secure
    - ```isHttpOnly()``` : Checks to see if cookie is Http-only
 
## Topics

### CSS Selectors
- Example:
  ```<input type="text in here" id="fistname" name="first_name" class="myForm">```

- Single Attribute
    - ```tagname[attribute='value']```
    - ```input[id='firstname']```
    - 
- Multiple Attributes
    - ```tagname[attribute1='value1'][attribute2='value2']```
    - ```input[id='firstname'][name='first_name']```
      
- By ID
    - ```tagname#id```
    - ```input#firstname```
    - ```#firstname```

- By Class
    - ```tagname.class```
    - ```input.myForm```
 
- Contains
    - ```tagname[attribute*='value']```
    - ```input[type*='text']```
 
- Starts With
    - ```tagname[attribute^='value']```
    - ```input[type^='text in']```

- Ends With
    - ```tagname[attribute$='value']```
    - ```input[type$='here']```

### AJAX
- 
