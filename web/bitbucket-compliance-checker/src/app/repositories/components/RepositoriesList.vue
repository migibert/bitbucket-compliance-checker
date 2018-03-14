<template>
  <div id="repositories-list">
    <table class="table is-fullwidth is-hoverable">
      <thead>
        <tr>
          <th class="is-hidden-mobile">ID</th>
          <th>Name</th>
          <th>Score</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody id="repositories-table">
        <tr v-for="repository in repositories" :key="repository.id">
          <td class="is-hidden-mobile">{{ repository.id }}</td>
          <td>{{ repository.name }}</td>
          <td>{{ repository.score }}</td>
          <td>{{ repository.status }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import { fetchRepositories } from '../api'

export default {
  data () {
    return {
      repositories: fetchRepositories()
    }
  }
}
</script>
