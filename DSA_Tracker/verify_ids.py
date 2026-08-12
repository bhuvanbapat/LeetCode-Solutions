import json

db = json.load(open('DSA_Tracker/revision_state.json', encoding='utf-8'))
pids = list(db['problems'].keys())
print(f"Total problems: {len(pids)}")

wrong = ['1056', '745', '907']
found = [p for p in wrong if p in pids]
print(f"Wrong IDs still present: {found if found else 'NONE - all clean'}")

correct = ['1011', '744', '875']
present = [p for p in correct if p in pids]
print(f"Correct IDs present: {present}")

# Show the corrected entries
for cid in correct:
    if cid in db['problems']:
        p = db['problems'][cid]
        print(f"  {cid}: {p['name']} ({p['pattern']})")
