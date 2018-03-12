export const fetchRules = () => {
  return [
    {
      "id": "1",
      "name": "rule1",
      "type": "soft",
      "score": 5,
      "category": "repository",
      "pattern": {
        "key": ".owner",
        "op": "matches",
        "value": "owner"
      }
    },
    {
      "id": "2",
      "name": "rule2",
      "type": "hard",
      "score": 0,
      "category": "code",
      "pattern": {
        "key": "mypath",
        "op": "exists"        
      }
    }
  ]
};
