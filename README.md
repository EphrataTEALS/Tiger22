# Codespaces, Content, and Container Repo for Ephrata High School AP Computer Science Java Course

## Creates a Development Container for Java on GitHub Codespaces

These instructions will guide you through the process of setting up Codespaces, an online IDE. _IDE_ stands for _Integrated Development Environment_, which is a program that software developers use to write code. You can use any text editor to write code, but an IDE makes it _much_ easier.

Think of Codespaces like Microsoft Word for code. You can write a really long essay in Notepad if you want to, but you'll almost always prefer to do it in Word or Google Docs.

### Create a Github account

Create a GitHub account. GitHub is a free service that stores code for you in the cloud. It is the industry standard for storing and sharing software code. Think of it like Google Drive for code!

For your username you can pick any available username, or something like: `<firstname>-<lastinitial>-ephrata-teals` format. So, if your name was Jane Doe, your username would be `jane-d-ephrata-teals`.

  1. In a new tab in your browser, go to https://github.com
  2. Click "Sign up" in the top right corner
  3. Enter your username (one of your choice available) or in the `<firstname>-<lastinitial>-ephrata-teals` format
  4. Enter your `@ephrataschools.org` email
  5. Choose a password
  6. Solve the verification puzzle
  7. Click "Create account"
  8. In a new tab in your browser, go to the Ephrata High School GMail. You should see an email from Github asking you to verify your email address
  9. Open the email and click "Verify email address"
  
### Fork the Tiger22 GitHub Repository

In this step you'll be copying an existing Github _repository_ to your own account. You can think of a repository as a special kind of folder for code. It's actually much more complicated (and powerful) than that, but you'll learn about all of that another time.

  1. In a new tab in your browser, go to https://github.com/EphrataTEALS/Tiger22 
  
  2. Click on "Fork" in the top right corner

        ![fork](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/fork.png)
        
  3. If you are asked "Where should we fork Tiger22?", click on your new Github username

        ![forkdest](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/forkdest.png)

You now have a copy of the Tiger22 repository in your GitHub. This is what you should see:

![yourcopy](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/yourcopy.png)

My username was tealsteacher so the repository shows up as `tealsteacher/Tiger22`.

Yours should be `<yourusername>/Tiger22`.

**Configure Codespaces**

Click on Code and select `Codespaces`

![openWithCodespaces](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/openWithCodespaces.png)

Click on `New codespace`

![newCodespace](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/newCodespace.png)

Select a Machine Type.  
Recommend a 4-core 8GB RAM

Click on Create codespace

![machinetype](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/machinetype.png)

When the Codespace opens it should look something like this

![yourCodespace](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/yourCodespace.png)

**Configure GitHub settings and remote for fork**

This step will involve entering some commands into the terminal, or command line. If this if the first time you've used a terminal, it can be intimidating. Don't worry! Just follow the directions and copy and paste the commands exactly. When an instruction says to _enter_ a command, it means to type (or paste) the command, and then press the Enter key to execute it.

  1. Open a terminal in your Codspace using the keyboard shortcut ``Ctrl + ` `` (you can also go to the menu in the top left and select Terminal > New Terminal) 
       
       ![terminalMenu](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/terminalMenu.png)

  Make sure it is a bash shell

  2. In the terminal, type or paste the following command and hit Enter:

```
pwd
```
It should return the path which will be something like `/workspaces/Tiger22`

  3. Now enter the following command (remember, "entering" a command means typing or pasting it into the terminal, then pressing Enter to execute it):

```
git status
```

  Your terminal should now look like the following:

  ![terminalOutput](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/terminalOutput.png)

  4. Enter the following command, replacing `<GitHubusername>` with the your username you created earlier:

```
git config --global user.name "<GitHubusername>"
```

  5. Confirm that you have set the username correctly by entering the following command:

```
git config --global user.name
```

  6. Enter the following command, replacing `email@example.com` with your `@ephrataschools.org` email:

```
git config --global user.email "email@example.com"
```

  7. Confirm that you have set the email address correctly by entering the following command:

```
git config --global user.email
```

If you prefer to use the UI in GitHub you can do this prior to opening you codespace.

Click on `Fetch upstream` and then click on `Fetch and merge`

![fetchupstream](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/fetchupstream.png)

To do this from the terminal

  8. Enter the following command:

```
git remote -v
```

  9. Make sure that your terminal displays the following:

```
> origin    https://github.com/<yourusername>/Tiger22 (fetch)
> origin    https://github.com/<yourusername>/Tiger22 (push)
> upstream  https://github.com/EphrataTEALS/Tiger22.git (fetch)
> upstream  https://github.com/EphrataTEALS/Tiger22.git (push)
```

  If this is the case go to step 12

If it only shows the following:

```
> origin  https://github.com/<yourusername>/Tiger22 (fetch)
> origin  https://github.com/<yourusername>/Tiger22 (push)
```
Then 

  10. Enter the following command as-is (_do not_ replace the username):

```
git remote add upstream https://github.com/EphrataTEALS/Tiger22.git
```

  11. Enter the following command again:

```
git remote -v
```

  12. Finally, enter the following commands:

```
git config pull.rebase false
```

```
git pull upstream main
```

**Run your CodespacesBeta.java program!**

  1. In `sampleCode >`, find `CodespacesBeta.java` in the `GitHubCodespacesTest` folder.  The contents of the file should look like this:

```
package sampleCode.GitHubCodespacesTest;

public class CodespacesBeta {
    public static void main(String[] args) {
        String x = "Welcome Back !!!";
        System.out.println(x);
        
    }
}
```
  2. Codespaces may automatically open some other tabs. If this happens, just close them and return to `CodespacesBeta.java`.
  3. On the sidebar, click the "Run" button (the one with the play button and the little bug):

   ![run](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/run.png)

  3. Click "Run and Debug". Again, Codespaces may automatically open some other tabs. If this happens, close them and click "Run and Debug" again.
  4. You should see the following output in the terminal:

  ![terminal](https://raw.githubusercontent.com/EphrataTEALS/Tiger22/main/images/terminal.png)

Congratulations! You just ran your first program!

**Copy the GitHubCodespacesTest folder and paste to studentWork folder and then change the code**

  1. Copy the GitHubCodespacesTest folder and paste to studentWork folder
  2. In `CodespacesBeta.java`, find the line that reads `package sampleCode.GitHubCodespacesTest;`
  3. Change sampleCode to studentWork so it reads `package studentWork.GitHubCodespacesTest;`
  4. In `CodespacesBeta.java`, find the line that reads `System.out.println("Welcome Back !!!");`
  5. Replace `Welcome Back` with `Its a New Year` (or anything, really! You could write `Happy New Year <your dog's name>` or `Time to get back to work`)
  6. Click the "Run and Debug" button again
  7. You should see the new greeting in the terminal. You just wrote your first piece of code!
  8. To save your work, enter the following sequence of commands in the terminal:
  
```
git add -A
git commit -m "Modified CodespacesTest.java"
git push origin main
```

### In future classes:

At the beginning of each class, after opening your Codepsace, you will open a terminal window (with ``Ctrl + ` `` or using menu and going to Terminal > New Terminal). Then you will enter the following commands:

```
git config pull.rebase false
```

```
git pull upstream main
```

This command gets any new code from the instructors that you will need for the class that day.

At the end of every class, you will run the following sequence of commands:

```
git add -A
git commit -m "<description of your work for the day>"
git push origin main
```
This will save your changes by pushing them changes to your forked repository.

