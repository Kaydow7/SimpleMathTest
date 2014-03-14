SimpleMathTest
==============

csc216

Setting up Intellj

-----------------

1. Create an accout with https://github.com/
	a. Once you've created your account, verify your email address.
	b. Next Search for SimpleMathTest, join the csc216 group.
	c. If you can't join the group email me(Kaydow7@gmail.com) with your user name

2. Download and install the git program
	a. Link-> http://msysgit.github.io/
	b. When installing, choose the Git Bash Only radio button click next
	c. Choose OpenSSH, click next
	d. Checkout WIndows-style, commit Unix-style line endings radio button click next
	c. Click finish.
	

3. Link Intellj with github
	a. Intellj->File->Settings(CTR+ALT+S) (Or Configure-> Settings from the main screen)
	b. Version Control->GitHub
	c. Host: github.com
		a. Login->github.com login name
		b. password->github.com password
		c. Test the settings
		d. Apply the settings.

4. Link the git.exe with Intellj
	a. Intellj->File->Settings(CTR+ALT+S) (Or Configure-> Settings from the main screen)
	b. Version Control->Git
	c. For the path to Git executable type the following
		 i. %SYSTEMROOT%\Program Files (x86)\Git\cmd\git.exe	 
		ii. Click Test then apply

5. Connecting to the Repository
	a. Intellj -> File -> Settings(CTR+ALT+S) (Or Configure-> Settings from the main screen)
	b. Choose Servers node in the Tasks child
	c. Enter the following settings:
		   i. Host: github.com
		  ii. Repository: Kaydow7 / SimpleMathTest
		 iii. Click Create API token
                  vi. Test the settings, then apply

6. Setting up the VCS
	a. The Quick Start should have added the VCS Check out from Version Control menu Option on the main page
	b. Click the check out
		   i. Git Repository URL: https://github.com/CSC-216-Group/SimpleMathTest.git
		  ii. Parent Directory  : Location on your harddrive to store the new project ie. (%USERPROFILE%\Desktop\Workplace\OCC\CurrentSemester\Java)
		 iii. Directory Name    : This will be the directory that you will be cloning too ie.(SimpleMathTest)
	c. Click Clone
	d. A dialog box prompts you to create a project for the sources you have checked out.
		   i. Click yes
		  ii. Select the Create project from existing sources radio box, then click next
		 iii. A form will show the project name and location, These should already be filled out for you, Click the next button
		  vi. Click Finish.
