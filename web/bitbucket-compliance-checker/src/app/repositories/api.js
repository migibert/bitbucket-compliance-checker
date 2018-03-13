export const fetchRepositories = () => {
  return [
    {
      id: '1',
      name: 'repo1',
      score: 5,
      status: 'SUCCESS'
    },
    {
      id: '2',
      name: 'repo2',
      score: -10,
      status: 'WARNING'
    },
    {
      id: '3',
      name: 'repo3',
      score: 0,
      status: 'ERROR'
    }
  ]
}

export const fetchRepository = (id) => {
  return [
    {
      id: id,
      name: 'repo3',
      score: 0,
      status: 'ERROR',
      broken_rules: [
        { 'name': 'rule1' },
        { 'name': 'rule2' }
      ]
    }
  ]
}
