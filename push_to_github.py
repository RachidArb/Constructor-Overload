import subprocess
import os
import sys

def run_git_command(command_list):
    """Run a git command and print output."""
    try:
        result = subprocess.run(command_list, check=True, text=True, capture_output=True)
        print(result.stdout)
    except subprocess.CalledProcessError as e:
        print(e.stderr)
        sys.exit(1)

# -----------------------
# Step 1: Get user input
# -----------------------
project_path = input("Enter your Eclipse project path: ").strip()
github_username = input("Enter your GitHub username: ").strip()
repo_name = input("Enter the GitHub repository name: ").strip()
branch = input("Enter branch name (default: main): ").strip() or "main"

# -----------------------
# Step 2: Verify folder exists
# -----------------------
if not os.path.isdir(project_path):
    print(f"Error: Folder '{project_path}' does not exist.")
    sys.exit(1)

os.chdir(project_path)
print(f"Current directory: {os.getcwd()}")

# -----------------------
# Step 3: Initialize Git repo if needed
# -----------------------
if not os.path.exists(os.path.join(project_path, ".git")):
    print("Initializing Git repository...")
    run_git_command(["git", "init"])
else:
    print("Git repository already exists.")

# -----------------------
# Step 4: Stage all files
# -----------------------
print("Adding files...")
run_git_command(["git", "add", "."])

# -----------------------
# Step 5: Commit
# -----------------------
print("Committing files...")
run_git_command(["git", "commit", "-m", "Initial commit"])

# -----------------------
# Step 6: Add remote (SSH)
# -----------------------
ssh_url = f"git@github.com:{github_username}/{repo_name}.git"
existing_remotes = subprocess.run(["git", "remote"], capture_output=True, text=True).stdout.splitlines()

if "origin" not in existing_remotes:
    print(f"Adding remote '{ssh_url}'...")
    run_git_command(["git", "remote", "add", "origin", ssh_url])
else:
    print("Remote 'origin' already exists, updating URL...")
    run_git_command(["git", "remote", "set-url", "origin", ssh_url])

# -----------------------
# Step 7: Push to GitHub
# -----------------------
print(f"Pushing to GitHub on branch '{branch}'...")
run_git_command(["git", "push", "-u", "origin", branch])

print(f"\n✅ Project successfully pushed to {ssh_url} on branch '{branch}'!")
