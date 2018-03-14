<template>
  <div id="rules-list">
    <table class="table is-fullwidth is-hoverable">
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Type</th>
          <th>Score</th>
          <th>Category</th>
          <th class="is-hidden-touch">Operation</th>
        </tr>
      </thead>
      <tbody id="rules-table">
        <tr v-for="rule in rules" :key="rule.id">
          <td>{{ rule.id }}</td>
          <td>{{ rule.name }}</td>
          <td>{{ rule.type }}</td>
          <td>{{ rule.score }}</td>
          <td>{{ rule.category }}</td>
          <td class="is-hidden-touch">{{ rule.operation.key }} {{ rule.operation.operator }} {{ rule.operation.value }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import { fetchRules } from '../api'

export default {
  data () {
    return {
      rules: fetchRules()
    }
  }
}
</script>
