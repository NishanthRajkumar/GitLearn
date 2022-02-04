# Git Commands
Learning to push, pull, fetch... etc

Git commands to start from scrach (Empty repo in local and remote)

1. git init
	-> Current working directory is intialized as empty Git repo
	-> Default branch name of this local repo: master
	-> `git branch` will display nothing since 1st commit is missing
2. git status
3. git add <file>
	-> Use this command if you want git to add these files to local repo
	-> `git add --all` adds all untracked files
	-> When added they move to staging area
		-> Basically stored temporarily in branch until committed
		-> `git rm --cached <file>` to undo `git add`
		-> `git rm -r --cached <files>` for multiple files
4. `git stash` will delete all uncommitted changes made in branch
5. git commit -m "<commit message>"
	-> Always give a commit msg. Never leave it empty
6. git branch <branch name>
	-> Creates new branch of name: `<branch name>`
7. git checkout <branch name>
	-> Switches from current branch to <branch name>
8. git remote add <variable name> <repo clone link>
	-> Creates a variable <variable name> and stores the repo clone link
	-> This will be useful to push/pull/fetch...etc from online repo
9. git push <variable name/ repo clone link> <branch name>
	-> Will push committed changes of <branch name> to online repo
10. git push -u <variable name/ repo clone link> <branch name>
	-> Use this if:-
		-> this is your 1st push, and you have not made any clone, fetch, pull from this online repo prior to this





Git cloning
If you are cloning from online repo and do not wish to create your own local machine repo before that then the following applies:

1. git clone <repo clone link>
	-> A new directory named after the cloned project will appear
2. All of the above commands are applicable except:-
	-> `git init`
	-> `git push -u <variable name/ repo clone link> <branch name>`
	-> The above 2 are not applicable since local machine repo was never created from scratch
