# Project Name

Java Selenium Cheat Sheet

## Table of Contents

- [About](#about)
- [Common Methods](#methods)
    - [WebDriver Interface](#webdriver-interface)
    - [WebElement Interface](#webelement-interface)
    - [By Class](#by-class)
    - [Action Class](#action-class)
    - [Expected Conditions Class](#expected-conditions-class)
    - [WebDriverWait Class](#webdriverwait-class)
    - [Implicit Wait](#implicit-wait)
    - [Explicit Wait](#explicit-wait)
    - [Select Class](#select-class)
    - [JavaScriptExecutor Interface](#javascriptexecutor-interface)
    - [Cookie Interface](#cookie-interface)
- [Topics](#topics)
    - [CSS Selectors](#css-selectors)
    - [AJAX](#ajax)

## About

A repository to recall commonly used Selenium functions. Also to practice using Git commits and merges. 

## Methods

### WebDriver Interface
- Description : Controls browsers and interacts with elements

    - ```get(string URL)``` : Loads a new webpage
    - ```getWindowHandles()``` : Returns a set of all window handles currently open
    - ```getWindowHandle()``` : Returns current window handle
    - ```getTitle()``` : Returns current window title
    - ```getCurrentUrl()``` : Returns current page URL
    - ```getPageSource()``` : Returns source code of current page
    - ```findElement(By by)``` : Finds the first WebElement using the given method to locate it
    - ```findElements(By by)``` : Finds all WebElements using the given method to locate it
    - ```navigate()``` : Provides a way to navigate with more control
      ```java
      Examples:
      driver.navigate().to("http://www.example.com");
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
      ```
      
    - ```manage()``` : Returns an instance of the Options interface for managing driver-specific settings
      ```java
      Examples:
      driver.manage().window().maximize();
      driver.manage().window().setSize(new Dimension(1024, 768));
      ```
      
    - ```close()``` : Closes current browser
    - ```exit()``` : Closes all browsers and ends WebDriver session
    - ```switchTo()``` : Switches to different frames, windows, or alerts
      ```java
      Examples:
      driver.switchTo().frame("frameName");
      driver.switchTo().defaultContent();
      driver.switchTo().window("windowHandle");
      driver.switchTo().alert().accept();
      ```
      

### WebElement Interface
- Description : Represents HTML elements on a web page

    - ```click()``` : Clicks on the element
    - ```clear()``` : Clears content of text input
    - ```submit``` : Submits form
    - ```sendKeys(Keys to Send)``` : Sends keystrokes to the element
    - ```getText()``` : Returns the visible text of the element
    - ```getTagName()``` : Returns tag name of element
    - ```getLocation()``` : Returns location of element in page
    - ```getSize()``` : Returns size of element in page
    - ```getAttribute(String name)``` : Returns value of attribute for the element
    - ```getCssValue(String propertyName)``` : Returns value of CSS property for the element
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
      ```java
      Example:
      Actions actions = new Actions(driver);
      actions.moveToElement(element).click().build().perform();
      ```
      
    - ```click(WebElement element)``` : Performs a left click action
    - ```doubleClick(WebElement element)``` : Performs a double left click action
    - ```contextClick(WebElement element)``` : Performs a right click action
    - ```dragAndDrop(WebElement source, WebElement target)``` : Performs a drag and drop action
      ```java
      Example:
      Actions actions = new Actions(driver);
      actions.dragAndDrop(sourceElement, targetElement).build().perform();
      ```

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
 
### Implicit Wait
- Description: Wait mechanic that waits for a set amount of time
- Initialize Wait:
  ```
  Example:
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  ```

### Explicit Wait
- Description: Wait mechanic that waits for a certain condition
- Intialize Wait:
  ```java
  WebDriverWait wait = new WebDriverWait(driver, 10);
  ```
  
    - presenceOfElementLocated : Waits for element to be present (does not include visible on page)
      ```java
      Example:
      WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("element_id")));
      ```
      
    - visibilityOfElementLocated : Waits for element to be visible on page
      ```java
      Example:
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element_id")));
      ```
      
    - elementToBeClickable : Waits for element to be visible and clickable
      ```java
      Example:
      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("element_id")));
      ```
      
    - textToBePresentInElement : Waits for element to have specific string
      ```java
      Example:
      boolean result = wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("element_id")), "expected_text"));
      ```
      
    - titleContains : Waits for title page to contain string
      ```java
      Example:
      boolean result = wait.until(ExpectedConditions.titleContains("expected_title"));
      ```
      
    - frameToBeAvailableAndSwitchToIt : Waits for frame to be available and switches to it
      ```java
      Example:
      wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame_name_or_id"));
      ```
      
    - invisibilityOfElementLocated : Waits for element to not be visible on page
      ```java
      Example:
      boolean result = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("element_id")));
      ```
      
    - elementToBeSelected : Waits for element to be selected
      ```java
      Example:
      WebElement element = wait.until(ExpectedConditions.elementToBeSelected(By.id("element_id")));
      ```
      
    - numberOfElementsToBe : Waits for number of elements are located
      ```java
      Example:
      List<WebElement> elements = wait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("tag_name"), 3));
      ```
      
    - presenceOfAllElementsLocatedBy : Waits for all elements to be present
      ```java
      Example:
      List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("class_name")));
      ```
      
    - visibilityOfAllElements : Waits for all elements to be visible on page
      ```java
      Example:
      List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.tagName("tag_name"))));
      ```
      
    - alertIsPresent : Waits for alert to be present
      ```java
      Example:
      Alert alert = wait.until(ExpectedConditions.alertIsPresent());
      ```

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
      ```java
      Examples:
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,1000)");
      js.executeScript("arguments[0].click();", element);
      ```

    - ```executeAsyncScript(String script, Object... args)``` : Executes an asynchronous JavaScript function

### Cookie Interface
- Description : Represents browser cookie

    - ```manage().getCookies()``` : Returns all cookies in domain
      ```java
      Example:
      Set<Cookie> cookies = driver.manage().getCookies();
      ```
      
    - ```manage().getCookieNamed(String name)``` : Returns specific cookie in domain
      ```java
      Example:
      Cookie cookie = driver.manage().getCookieNamed("cookieName");
      ```
      
    - ```manage().addCookie(Cookie cookie)``` : Adds cookie to domain
      ```java
      Example:
      driver.manage().addCookie(new Cookie("name", "value"));
      ```
      
    - ```manage().deleteCookieNamed(String name)``` : Deletes specific cookie in domain
      ```java
      Example:
      driver.manage().deleteCookieNamed("cookieName");
      ```

    - ```manage().deleteAllCookies()``` : Deletes all cookies in domain
      ```java
      Example:
      driver.manage().deleteAllCookies();
      ```

    - ```isSecure()``` : Checks to see if cookie is secure
    - ```isHttpOnly()``` : Checks to see if cookie is Http-only
 
## Topics

### CSS Selectors
- Example:
  ```<input type="text in here" id="fistname" name="first_name" class="myForm">```

- Single Attribute
    - ```tagname[attribute='value']```
    - ```input[id='firstname']```
      
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
- #### TBD
