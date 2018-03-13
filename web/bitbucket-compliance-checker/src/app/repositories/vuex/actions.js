import { fetchRepositories } from '../api'

export const loadRepositories = ({ state, commit }) => {
  return fetchRepositories().then((result) => {
    commit('LOAD REPOSITORIES', result)
  })
}
