<template>
  <div id="repositories-list">
    <table class="table">
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Score</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody id="repositories-table">
        <tr v-for="repository in repositories" :key="repository.id">
          <td>{{ repository.id }}</td>
          <td>{{ repository.name }}</td>
          <td>{{ repository.score }}</td>
          <td>{{ repository.status }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  data () {
    return {
      repositories: [
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
  }
}
</script>
