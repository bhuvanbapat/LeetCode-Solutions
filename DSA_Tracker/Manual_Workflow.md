# 📖 DSA Tracking: Manual Workflow Guide

This document explains everything that has been set up in this directory and exactly what you need to do on a daily basis when you open your laptop to solve LeetCode problems.

---

## 🛠️ What is Currently Set Up?

1. **Local Repository & GitHub Sync**
   - This entire folder (`C:\Users\bhuva\OneDrive\Desktop\DSA`) is a Git repository synced to your GitHub (`bhuvanbapat/LeetCode-Solutions`).
   - Every solution you've solved in the past is stored in its respective folder (e.g., `Two_Sum/solution.java`).

2. **LeetSync Browser Extension**
   - You have the **LeetSync v2** extension installed on your browser.
   - **What it does:** Every time you submit a *correct* solution on LeetCode, LeetSync automatically downloads the code file to this local directory and pushes it to your GitHub repository in the background. 

3. **DSA.xlsx (Excel Tracker)**
   - An Excel spreadsheet exists in this directory to manually log what problems you have solved, the topic, difficulty, and your confidence/notes.
   - **Note:** `DSA.xlsx` is hidden from GitHub using `.gitignore` so your personal notes stay private.

4. **Markdown Trackers (`DSA_Tracker/`)**
   - `Dashboard.md`: An overview of your progress (Total solved, Easy/Med/Hard breakdown).
   - `Daily_Log.md`: A historical log of when you solved specific problems.
   - `generate_tracker.py`: A Python script that reads your `DSA.xlsx` file and instantly updates both the Dashboard and the Daily Log.

---

## 💻 Your Daily Routine

Whenever you sit down to solve a problem on LeetCode, follow these 3 simple steps:

### Step 1: Solve on LeetCode (Let LeetSync work)
1. Open LeetCode and solve your problem.
2. Hit **Submit**.
3. If the solution is accepted, **LeetSync** will automatically create the folder here and push the code to your GitHub repo. *You don't need to do anything with Git or code files.*

### Step 2: Update Your Excel Tracker
1. Open `DSA.xlsx` in Excel.
2. Add a new row for the problem you just solved. Fill in the Date, Problem Name, Link, Difficulty, Category, and your Confidence Level.
3. Save the Excel file (`Ctrl + S`) and close it.

### Step 3: Run the Tracker Script
To reflect your new Excel row in the Markdown trackers, you just need to run the python script:
1. Open PowerShell or Command Prompt.
2. Navigate to your DSA folder: 
   ```bash
   cd C:\Users\bhuva\OneDrive\Desktop\DSA
   ```
3. Run the synchronization script to update your trackers and revision state:
   ```bash
   python dsa_system.py sync
   ```
4. Generate today's revision plan:
   ```bash
   python dsa_system.py daily
   ```
5. Check `DSA_Tracker/Daily_Plan.md` and perform your assigned reviews.
6. Record your review outcomes using the CLI (where `[ID]` is the problem ID from LeetCode):
   ```bash
   python dsa_system.py review [ID]
   ```
7. *Optional:* If you want to back up your trackers to GitHub (since LeetSync only backs up the code):
   ```bash
   git add DSA_Tracker/
   git commit -m "Update tracker logs"
   git push origin main
   ```

---

## 🚨 Troubleshooting

- **My code isn't showing up on GitHub!**
  Check the LeetSync extension icon in your browser to ensure it is connected properly to your `LeetCode-Solutions` repository. If it disconnected, simply re-authenticate it.
- **The Python script threw an error!**
  Make sure you actually saved and closed the `DSA.xlsx` file before running `python generate_tracker.py`. Open Excel files are locked and cannot be read by scripts.
