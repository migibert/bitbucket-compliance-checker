export const fetchRules = () => {
  return [
    {
      id: '1',
      name: 'rule1',
      type: 'soft',
      score: 5,
      category: 'repository',
      operation: {
        key: '.owner',
        operator: 'matches',
        value: 'owner'
      }
    },
    {
      id: '2',
      name: 'rule2',
      type: 'hard',
      score: 0,
      category: 'code',
      operation: {
        key: 'mypath',
        operator: 'exists'
      }
    },
    {
      id: '3',
      name: 'rule3',
      type: 'hard',
      score: 0,
      category: 'code',
      operation: {
        key: 'mypath',
        operator: 'contains',
        value: 'version: v0.10.8'
      }
    }
  ]
}
