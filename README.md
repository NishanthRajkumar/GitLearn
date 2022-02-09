# Git Commands
##### (Learning to push, pull, fetch... etc)
##### (And to resolve merge conflicts if any)


## Git commands to start from scrach (from empty repo in local system)
<ol>
	<li>
		`git init`
	</li>
	<ul>
		<li>
			Current working directory is intialized as empty Git repo
		</li>
		<li>
			Default branch name of this local repo: 'master'
		</li>
		<li>
			`git branch` will display nothing since 1st commit is missing
		</li>
	</ul>
	<li>
		`git status`
	</li>
	<li>
		`git add < file >`
	</li>
	<ul>
		<li>
			Use this command if you want git to add these files to local repo
		</li>
		<li>
			`git add --all` adds all untracked files
		</li>
		<li>
			When added they move to staging area
		</li>
		<ul>
			<li>
				Basically stored temporarily in branch until committed
			</li>
			<li>
				`git rm --cached < file >` to undo `git add`
			</li>
			<li>
				`git rm -r --cached < files >` for multiple files
			</li>
		</ul>
	</ul>
	<li>
		`git stash` will delete all uncommitted changes made in branch
	</li>
	<li>
		`git commit -m "< commit message >"`
	</li>
	<ul>
		<li>
			Always give a commit msg. Never leave it empty
		</li>
	</ul>
	<li>
		`git branch < branch name >`
	</li>
	<ul>
		<li>
			Creates new branch of name: `< branch name >`
		</li>
	</ul>
	<li>
		`git checkout < branch name >`
	</li>
	<ul>
		<li>
			Switches from current branch to `< branch name >`
		</li>
	</ul>
	<li>
		`git remote add < variable name > < repo clone link >`
	</li>
	<ul>
		<li>
			Creates a variable `< variable name >` and stores the repo clone link
		</li>
		<li>
			This will be useful to push/pull/fetch...etc from online repo
		</li>
	</ul>
	<li>
		`git push < variable name/ repo clone link > < branch name >`
	</li>
	<ul>
		<li>
			Will push committed changes of < branch name > to online repo
		</li>
	</ul>
	<li>
		`git push -u < variable name/ repo clone link > < branch name >`
	</li>
	<ul>
		<li>
			Use this if:-
		</li>
		<ul>
			<li>
				this is your 1st push, and you have not made any clone, fetch, pull from this online repo prior to this
			</li>
		</ul>
	</ul>
</ol>

<br></br>

## Git cloning
### If you are cloning from online repo and do not wish to create your own local machine repo before that then the following applies:
<ol>
	<li>
		`git clone < repo clone link >`
	</li>
   	<ul>
	<li>
		A new directory named after the cloned project will appear
	</li>
	</ul>
	<li>The following commands are not applicable for cloning:-</li>
	<ul>
		<li>
			`git init`
		</li>
		<li>
			`git push -u < variable name/ repo clone link > < branch name >`
		</li>
		<li>
			These 2 commands are not applicable since local machine repo was never created from scratch
		</li>
	</ul>
</ol>

## Git merge conflict resolution
<ol>
	<li>
		If conflict occurs when merging branches on the local machine:
	</li>
	<ul>
		<li>
			Use `git mergetool`. It allows you to edit the files by comparing with merging branch
		</li>
		<li>
			After successful mergetool edit, do `git commit -m "< commit message >"`
		</li>
	</ul>
	<li>
		If conflict occurs when pushing to remote branch then:
	</li>
	<ul>
		<li>
			Do `git pull --rebase < variable name/ repo clone link > < branch name >`
		</li>
		<ul>
			<li>
				Above command will give you the details of the conflict
			</li>
			<li>
				Now use `git mergetool`
			</li>
			<li>
				After mergetool edit is successful, do `git rebase --continue`
			</li>
			<li>
				No need to commit at this point
			</li>
		</ul>
		<li>
			After rebase is successful, push the local branch
		</li>
	</ul>
</ol>
